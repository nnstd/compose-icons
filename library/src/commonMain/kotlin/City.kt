package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.City: ImageVector
    get() {
        if (_City != null) {
            return _City!!
        }
        _City = ImageVector.Builder(
            name = "City",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 15f)
                horizontalLineTo(17f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                moveTo(19f, 19f)
                horizontalLineTo(17f)
                verticalLineTo(17f)
                horizontalLineTo(19f)
                moveTo(13f, 7f)
                horizontalLineTo(11f)
                verticalLineTo(5f)
                horizontalLineTo(13f)
                moveTo(13f, 11f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                moveTo(13f, 15f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                moveTo(13f, 19f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                moveTo(7f, 11f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(7f)
                moveTo(7f, 15f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                moveTo(7f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(17f)
                horizontalLineTo(7f)
                moveTo(15f, 11f)
                verticalLineTo(5f)
                lineTo(12f, 2f)
                lineTo(9f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(3f)
                verticalLineTo(21f)
                horizontalLineTo(21f)
                verticalLineTo(11f)
                horizontalLineTo(15f)
                close()
            }
        }.build()

        return _City!!
    }

@Suppress("ObjectPropertyName")
private var _City: ImageVector? = null
