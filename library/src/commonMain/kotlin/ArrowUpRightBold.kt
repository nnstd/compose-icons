package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowUpRightBold: ImageVector
    get() {
        if (_ArrowUpRightBold != null) {
            return _ArrowUpRightBold!!
        }
        _ArrowUpRightBold = ImageVector.Builder(
            name = "ArrowUpRightBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 21f)
                verticalLineTo(17f)
                horizontalLineTo(10.5f)
                curveTo(12.43f, 17f, 14f, 15.43f, 14f, 13.5f)
                verticalLineTo(11f)
                horizontalLineTo(10f)
                lineTo(16f, 4f)
                lineTo(22f, 11f)
                horizontalLineTo(18f)
                verticalLineTo(13.5f)
                curveTo(18f, 17.64f, 14.64f, 21f, 10.5f, 21f)
                horizontalLineTo(3f)
                close()
            }
        }.build()

        return _ArrowUpRightBold!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUpRightBold: ImageVector? = null
