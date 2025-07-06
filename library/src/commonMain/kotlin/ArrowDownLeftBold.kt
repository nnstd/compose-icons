package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowDownLeftBold: ImageVector
    get() {
        if (_ArrowDownLeftBold != null) {
            return _ArrowDownLeftBold!!
        }
        _ArrowDownLeftBold = ImageVector.Builder(
            name = "ArrowDownLeftBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 3f)
                verticalLineTo(7f)
                horizontalLineTo(13.5f)
                curveTo(11.57f, 7f, 10f, 8.57f, 10f, 10.5f)
                verticalLineTo(13f)
                horizontalLineTo(14f)
                lineTo(8f, 20f)
                lineTo(2f, 13f)
                horizontalLineTo(6f)
                verticalLineTo(10.5f)
                curveTo(6f, 6.36f, 9.36f, 3f, 13.5f, 3f)
                horizontalLineTo(21f)
                close()
            }
        }.build()

        return _ArrowDownLeftBold!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDownLeftBold: ImageVector? = null
