package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Forwardburger: ImageVector
    get() {
        if (_Forwardburger != null) {
            return _Forwardburger!!
        }
        _Forwardburger = ImageVector.Builder(
            name = "Forwardburger",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 13f)
                horizontalLineTo(3f)
                verticalLineTo(11f)
                horizontalLineTo(19f)
                lineTo(15f, 7f)
                lineTo(16.4f, 5.6f)
                lineTo(22.8f, 12f)
                lineTo(16.4f, 18.4f)
                lineTo(15f, 17f)
                lineTo(19f, 13f)
                moveTo(3f, 6f)
                horizontalLineTo(13f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                moveTo(13f, 16f)
                verticalLineTo(18f)
                horizontalLineTo(3f)
                verticalLineTo(16f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _Forwardburger!!
    }

@Suppress("ObjectPropertyName")
private var _Forwardburger: ImageVector? = null
