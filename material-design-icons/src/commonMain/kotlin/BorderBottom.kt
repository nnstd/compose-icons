package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BorderBottom: ImageVector
    get() {
        if (_BorderBottom != null) {
            return _BorderBottom!!
        }
        _BorderBottom = ImageVector.Builder(
            name = "BorderBottom",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 15f)
                horizontalLineTo(3f)
                verticalLineTo(17f)
                horizontalLineTo(5f)
                moveTo(3f, 21f)
                horizontalLineTo(21f)
                verticalLineTo(19f)
                horizontalLineTo(3f)
                moveTo(5f, 11f)
                horizontalLineTo(3f)
                verticalLineTo(13f)
                horizontalLineTo(5f)
                moveTo(19f, 9f)
                horizontalLineTo(21f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
                moveTo(19f, 5f)
                horizontalLineTo(21f)
                verticalLineTo(3f)
                horizontalLineTo(19f)
                moveTo(5f, 7f)
                horizontalLineTo(3f)
                verticalLineTo(9f)
                horizontalLineTo(5f)
                moveTo(19f, 17f)
                horizontalLineTo(21f)
                verticalLineTo(15f)
                horizontalLineTo(19f)
                moveTo(19f, 13f)
                horizontalLineTo(21f)
                verticalLineTo(11f)
                horizontalLineTo(19f)
                moveTo(17f, 3f)
                horizontalLineTo(15f)
                verticalLineTo(5f)
                horizontalLineTo(17f)
                moveTo(13f, 3f)
                horizontalLineTo(11f)
                verticalLineTo(5f)
                horizontalLineTo(13f)
                moveTo(17f, 11f)
                horizontalLineTo(15f)
                verticalLineTo(13f)
                horizontalLineTo(17f)
                moveTo(13f, 7f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                moveTo(5f, 3f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                moveTo(13f, 11f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                moveTo(9f, 3f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                horizontalLineTo(9f)
                moveTo(13f, 15f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                moveTo(9f, 11f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _BorderBottom!!
    }

@Suppress("ObjectPropertyName")
private var _BorderBottom: ImageVector? = null
