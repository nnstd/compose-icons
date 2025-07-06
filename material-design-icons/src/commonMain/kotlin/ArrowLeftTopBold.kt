package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowLeftTopBold: ImageVector
    get() {
        if (_ArrowLeftTopBold != null) {
            return _ArrowLeftTopBold!!
        }
        _ArrowLeftTopBold = ImageVector.Builder(
            name = "ArrowLeftTopBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 21f)
                horizontalLineTo(17f)
                verticalLineTo(13.5f)
                curveTo(17f, 11.57f, 15.43f, 10f, 13.5f, 10f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                lineTo(4f, 8f)
                lineTo(11f, 2f)
                verticalLineTo(6f)
                horizontalLineTo(13.5f)
                curveTo(17.64f, 6f, 21f, 9.36f, 21f, 13.5f)
                verticalLineTo(21f)
                close()
            }
        }.build()

        return _ArrowLeftTopBold!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLeftTopBold: ImageVector? = null
