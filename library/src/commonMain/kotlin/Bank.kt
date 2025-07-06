package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Bank: ImageVector
    get() {
        if (_Bank != null) {
            return _Bank!!
        }
        _Bank = ImageVector.Builder(
            name = "Bank",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.5f, 1f)
                lineTo(2f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(21f)
                verticalLineTo(6f)
                moveTo(16f, 10f)
                verticalLineTo(17f)
                horizontalLineTo(19f)
                verticalLineTo(10f)
                moveTo(2f, 22f)
                horizontalLineTo(21f)
                verticalLineTo(19f)
                horizontalLineTo(2f)
                moveTo(10f, 10f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                verticalLineTo(10f)
                moveTo(4f, 10f)
                verticalLineTo(17f)
                horizontalLineTo(7f)
                verticalLineTo(10f)
                horizontalLineTo(4f)
                close()
            }
        }.build()

        return _Bank!!
    }

@Suppress("ObjectPropertyName")
private var _Bank: ImageVector? = null
