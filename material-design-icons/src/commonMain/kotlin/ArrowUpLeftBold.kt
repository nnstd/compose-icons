package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowUpLeftBold: ImageVector
    get() {
        if (_ArrowUpLeftBold != null) {
            return _ArrowUpLeftBold!!
        }
        _ArrowUpLeftBold = ImageVector.Builder(
            name = "ArrowUpLeftBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.5f, 21f)
                curveTo(9.36f, 21f, 6f, 17.64f, 6f, 13.5f)
                verticalLineTo(11f)
                horizontalLineTo(2f)
                lineTo(8f, 4f)
                lineTo(14f, 11f)
                horizontalLineTo(10f)
                verticalLineTo(13.5f)
                curveTo(10f, 15.43f, 11.57f, 17f, 13.5f, 17f)
                horizontalLineTo(21f)
                verticalLineTo(21f)
                horizontalLineTo(13.5f)
                close()
            }
        }.build()

        return _ArrowUpLeftBold!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUpLeftBold: ImageVector? = null
