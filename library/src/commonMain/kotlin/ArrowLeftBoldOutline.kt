package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowLeftBoldOutline: ImageVector
    get() {
        if (_ArrowLeftBoldOutline != null) {
            return _ArrowLeftBoldOutline!!
        }
        _ArrowLeftBoldOutline = ImageVector.Builder(
            name = "ArrowLeftBoldOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 22f)
                lineTo(3f, 12f)
                lineTo(13f, 2f)
                verticalLineTo(8f)
                horizontalLineTo(21f)
                verticalLineTo(16f)
                horizontalLineTo(13f)
                verticalLineTo(22f)
                moveTo(6f, 12f)
                lineTo(11f, 17f)
                verticalLineTo(14f)
                horizontalLineTo(19f)
                verticalLineTo(10f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                lineTo(6f, 12f)
                close()
            }
        }.build()

        return _ArrowLeftBoldOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLeftBoldOutline: ImageVector? = null
