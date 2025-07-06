package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowUUpRightBold: ImageVector
    get() {
        if (_ArrowUUpRightBold != null) {
            return _ArrowUUpRightBold!!
        }
        _ArrowUUpRightBold = ImageVector.Builder(
            name = "ArrowUUpRightBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 13.5f)
                verticalLineTo(6f)
                horizontalLineTo(7f)
                verticalLineTo(13.5f)
                curveTo(7f, 15.43f, 8.57f, 17f, 10.5f, 17f)
                reflectiveCurveTo(14f, 15.43f, 14f, 13.5f)
                verticalLineTo(11f)
                horizontalLineTo(10f)
                lineTo(16f, 4f)
                lineTo(22f, 11f)
                horizontalLineTo(18f)
                verticalLineTo(13.5f)
                curveTo(18f, 17.64f, 14.64f, 21f, 10.5f, 21f)
                reflectiveCurveTo(3f, 17.64f, 3f, 13.5f)
                close()
            }
        }.build()

        return _ArrowUUpRightBold!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUUpRightBold: ImageVector? = null
