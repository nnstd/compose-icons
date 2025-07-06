package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Trademark: ImageVector
    get() {
        if (_Trademark != null) {
            return _Trademark!!
        }
        _Trademark = ImageVector.Builder(
            name = "Trademark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.8f, 8.44f)
                horizontalLineTo(6.87f)
                verticalLineTo(16f)
                horizontalLineTo(4.89f)
                verticalLineTo(8.44f)
                horizontalLineTo(2f)
                verticalLineTo(7f)
                horizontalLineTo(9.8f)
                verticalLineTo(8.44f)
                moveTo(13.5f, 7f)
                lineTo(15.96f, 13.5f)
                lineTo(18.41f, 7f)
                horizontalLineTo(21f)
                verticalLineTo(16f)
                horizontalLineTo(19f)
                verticalLineTo(13.5f)
                lineTo(19.22f, 9.24f)
                lineTo(16.63f, 16f)
                horizontalLineTo(15.28f)
                lineTo(12.7f, 9.25f)
                lineTo(12.9f, 13.5f)
                verticalLineTo(16f)
                horizontalLineTo(10.93f)
                verticalLineTo(7f)
                horizontalLineTo(13.5f)
                close()
            }
        }.build()

        return _Trademark!!
    }

@Suppress("ObjectPropertyName")
private var _Trademark: ImageVector? = null
