package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Ribbon: ImageVector
    get() {
        if (_Ribbon != null) {
            return _Ribbon!!
        }
        _Ribbon = ImageVector.Builder(
            name = "Ribbon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.41f, 19.31f)
                lineTo(16.59f, 22.5f)
                lineTo(18f, 21.07f)
                lineTo(14.83f, 17.9f)
                moveTo(15.54f, 11.53f)
                horizontalLineTo(15.53f)
                lineTo(12f, 15.07f)
                lineTo(8.47f, 11.53f)
                horizontalLineTo(8.46f)
                verticalLineTo(11.53f)
                curveTo(7.56f, 10.63f, 7f, 9.38f, 7f, 8f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 8f)
                curveTo(17f, 9.38f, 16.44f, 10.63f, 15.54f, 11.53f)
                moveTo(16.9f, 13f)
                curveTo(18.2f, 11.73f, 19f, 9.96f, 19f, 8f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 1f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 8f)
                curveTo(5f, 9.96f, 5.81f, 11.73f, 7.1f, 13f)
                verticalLineTo(13f)
                lineTo(10.59f, 16.5f)
                lineTo(6f, 21.07f)
                lineTo(7.41f, 22.5f)
                lineTo(16.9f, 13f)
                close()
            }
        }.build()

        return _Ribbon!!
    }

@Suppress("ObjectPropertyName")
private var _Ribbon: ImageVector? = null
