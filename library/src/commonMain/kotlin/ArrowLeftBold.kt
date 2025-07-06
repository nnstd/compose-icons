package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowLeftBold: ImageVector
    get() {
        if (_ArrowLeftBold != null) {
            return _ArrowLeftBold!!
        }
        _ArrowLeftBold = ImageVector.Builder(
            name = "ArrowLeftBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 9f)
                verticalLineTo(15f)
                horizontalLineTo(12f)
                verticalLineTo(19.84f)
                lineTo(4.16f, 12f)
                lineTo(12f, 4.16f)
                verticalLineTo(9f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _ArrowLeftBold!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLeftBold: ImageVector? = null
