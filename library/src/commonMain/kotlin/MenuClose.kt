package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MenuClose: ImageVector
    get() {
        if (_MenuClose != null) {
            return _MenuClose!!
        }
        _MenuClose = ImageVector.Builder(
            name = "MenuClose",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 6f)
                horizontalLineTo(13f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                moveTo(3f, 16f)
                horizontalLineTo(13f)
                verticalLineTo(18f)
                horizontalLineTo(3f)
                verticalLineTo(16f)
                moveTo(3f, 11f)
                horizontalLineTo(15f)
                verticalLineTo(13f)
                horizontalLineTo(3f)
                verticalLineTo(11f)
                moveTo(16f, 7f)
                lineTo(14.58f, 8.39f)
                lineTo(18.14f, 12f)
                lineTo(14.58f, 15.61f)
                lineTo(16f, 17f)
                lineTo(21f, 12f)
                lineTo(16f, 7f)
                close()
            }
        }.build()

        return _MenuClose!!
    }

@Suppress("ObjectPropertyName")
private var _MenuClose: ImageVector? = null
