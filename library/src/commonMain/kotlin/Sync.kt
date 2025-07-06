package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Sync: ImageVector
    get() {
        if (_Sync != null) {
            return _Sync!!
        }
        _Sync = ImageVector.Builder(
            name = "Sync",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 18f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 12f)
                curveTo(6f, 11f, 6.25f, 10.03f, 6.7f, 9.2f)
                lineTo(5.24f, 7.74f)
                curveTo(4.46f, 8.97f, 4f, 10.43f, 4f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 20f)
                verticalLineTo(23f)
                lineTo(16f, 19f)
                lineTo(12f, 15f)
                moveTo(12f, 4f)
                verticalLineTo(1f)
                lineTo(8f, 5f)
                lineTo(12f, 9f)
                verticalLineTo(6f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 12f)
                curveTo(18f, 13f, 17.75f, 13.97f, 17.3f, 14.8f)
                lineTo(18.76f, 16.26f)
                curveTo(19.54f, 15.03f, 20f, 13.57f, 20f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 4f)
                close()
            }
        }.build()

        return _Sync!!
    }

@Suppress("ObjectPropertyName")
private var _Sync: ImageVector? = null
