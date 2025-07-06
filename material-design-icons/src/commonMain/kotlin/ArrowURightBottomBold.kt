package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowURightBottomBold: ImageVector
    get() {
        if (_ArrowURightBottomBold != null) {
            return _ArrowURightBottomBold!!
        }
        _ArrowURightBottomBold = ImageVector.Builder(
            name = "ArrowURightBottomBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.5f, 3f)
                horizontalLineTo(18f)
                verticalLineTo(7f)
                horizontalLineTo(10.5f)
                curveTo(8.57f, 7f, 7f, 8.57f, 7f, 10.5f)
                reflectiveCurveTo(8.57f, 14f, 10.5f, 14f)
                horizontalLineTo(13f)
                verticalLineTo(10f)
                lineTo(20f, 16f)
                lineTo(13f, 22f)
                verticalLineTo(18f)
                horizontalLineTo(10.5f)
                curveTo(6.36f, 18f, 3f, 14.64f, 3f, 10.5f)
                reflectiveCurveTo(6.36f, 3f, 10.5f, 3f)
                close()
            }
        }.build()

        return _ArrowURightBottomBold!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowURightBottomBold: ImageVector? = null
