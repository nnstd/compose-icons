package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowUDownRightBold: ImageVector
    get() {
        if (_ArrowUDownRightBold != null) {
            return _ArrowUDownRightBold!!
        }
        _ArrowUDownRightBold = ImageVector.Builder(
            name = "ArrowUDownRightBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.5f, 3f)
                curveTo(14.64f, 3f, 18f, 6.36f, 18f, 10.5f)
                verticalLineTo(13f)
                horizontalLineTo(22f)
                lineTo(16f, 20f)
                lineTo(10f, 13f)
                horizontalLineTo(14f)
                verticalLineTo(10.5f)
                curveTo(14f, 8.57f, 12.43f, 7f, 10.5f, 7f)
                reflectiveCurveTo(7f, 8.57f, 7f, 10.5f)
                verticalLineTo(18f)
                horizontalLineTo(3f)
                verticalLineTo(10.5f)
                curveTo(3f, 6.36f, 6.36f, 3f, 10.5f, 3f)
                close()
            }
        }.build()

        return _ArrowUDownRightBold!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUDownRightBold: ImageVector? = null
