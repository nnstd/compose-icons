package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Autorenew: ImageVector
    get() {
        if (_Autorenew != null) {
            return _Autorenew!!
        }
        _Autorenew = ImageVector.Builder(
            name = "Autorenew",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 6f)
                verticalLineTo(9f)
                lineTo(16f, 5f)
                lineTo(12f, 1f)
                verticalLineTo(4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 12f)
                curveTo(4f, 13.57f, 4.46f, 15.03f, 5.24f, 16.26f)
                lineTo(6.7f, 14.8f)
                curveTo(6.25f, 13.97f, 6f, 13f, 6f, 12f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 6f)
                moveTo(18.76f, 7.74f)
                lineTo(17.3f, 9.2f)
                curveTo(17.74f, 10.04f, 18f, 11f, 18f, 12f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 18f)
                verticalLineTo(15f)
                lineTo(8f, 19f)
                lineTo(12f, 23f)
                verticalLineTo(20f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 12f)
                curveTo(20f, 10.43f, 19.54f, 8.97f, 18.76f, 7.74f)
                close()
            }
        }.build()

        return _Autorenew!!
    }

@Suppress("ObjectPropertyName")
private var _Autorenew: ImageVector? = null
