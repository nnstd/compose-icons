package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowURightTopBold: ImageVector
    get() {
        if (_ArrowURightTopBold != null) {
            return _ArrowURightTopBold!!
        }
        _ArrowURightTopBold = ImageVector.Builder(
            name = "ArrowURightTopBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 13.5f)
                curveTo(3f, 9.36f, 6.36f, 6f, 10.5f, 6f)
                horizontalLineTo(13f)
                verticalLineTo(2f)
                lineTo(20f, 8f)
                lineTo(13f, 14f)
                verticalLineTo(10f)
                horizontalLineTo(10.5f)
                curveTo(8.57f, 10f, 7f, 11.57f, 7f, 13.5f)
                reflectiveCurveTo(8.57f, 17f, 10.5f, 17f)
                horizontalLineTo(18f)
                verticalLineTo(21f)
                horizontalLineTo(10.5f)
                curveTo(6.36f, 21f, 3f, 17.64f, 3f, 13.5f)
                close()
            }
        }.build()

        return _ArrowURightTopBold!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowURightTopBold: ImageVector? = null
