package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatHeaderPound: ImageVector
    get() {
        if (_FormatHeaderPound != null) {
            return _FormatHeaderPound!!
        }
        _FormatHeaderPound = ImageVector.Builder(
            name = "FormatHeaderPound",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 4f)
                horizontalLineTo(5f)
                verticalLineTo(10f)
                horizontalLineTo(9f)
                verticalLineTo(4f)
                horizontalLineTo(11f)
                verticalLineTo(18f)
                horizontalLineTo(9f)
                verticalLineTo(12f)
                horizontalLineTo(5f)
                verticalLineTo(18f)
                horizontalLineTo(3f)
                verticalLineTo(4f)
                moveTo(13f, 8f)
                horizontalLineTo(15.31f)
                lineTo(15.63f, 5f)
                horizontalLineTo(17.63f)
                lineTo(17.31f, 8f)
                horizontalLineTo(19.31f)
                lineTo(19.63f, 5f)
                horizontalLineTo(21.63f)
                lineTo(21.31f, 8f)
                horizontalLineTo(23f)
                verticalLineTo(10f)
                horizontalLineTo(21.1f)
                lineTo(20.9f, 12f)
                horizontalLineTo(23f)
                verticalLineTo(14f)
                horizontalLineTo(20.69f)
                lineTo(20.37f, 17f)
                horizontalLineTo(18.37f)
                lineTo(18.69f, 14f)
                horizontalLineTo(16.69f)
                lineTo(16.37f, 17f)
                horizontalLineTo(14.37f)
                lineTo(14.69f, 14f)
                horizontalLineTo(13f)
                verticalLineTo(12f)
                horizontalLineTo(14.9f)
                lineTo(15.1f, 10f)
                horizontalLineTo(13f)
                verticalLineTo(8f)
                moveTo(17.1f, 10f)
                lineTo(16.9f, 12f)
                horizontalLineTo(18.9f)
                lineTo(19.1f, 10f)
                horizontalLineTo(17.1f)
                close()
            }
        }.build()

        return _FormatHeaderPound!!
    }

@Suppress("ObjectPropertyName")
private var _FormatHeaderPound: ImageVector? = null
