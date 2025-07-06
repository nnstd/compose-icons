package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BorderRightVariant: ImageVector
    get() {
        if (_BorderRightVariant != null) {
            return _BorderRightVariant!!
        }
        _BorderRightVariant = ImageVector.Builder(
            name = "BorderRightVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 5f)
                horizontalLineTo(13f)
                verticalLineTo(3f)
                horizontalLineTo(11f)
                moveTo(15f, 5f)
                horizontalLineTo(17f)
                verticalLineTo(3f)
                horizontalLineTo(15f)
                moveTo(15f, 21f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                horizontalLineTo(15f)
                moveTo(19f, 21f)
                horizontalLineTo(21f)
                verticalLineTo(3f)
                horizontalLineTo(19f)
                moveTo(3f, 9f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                horizontalLineTo(3f)
                moveTo(3f, 17f)
                horizontalLineTo(5f)
                verticalLineTo(15f)
                horizontalLineTo(3f)
                moveTo(3f, 13f)
                horizontalLineTo(5f)
                verticalLineTo(11f)
                horizontalLineTo(3f)
                moveTo(11f, 21f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                horizontalLineTo(11f)
                moveTo(3f, 21f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(3f)
                moveTo(7f, 5f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                horizontalLineTo(7f)
                moveTo(3f, 5f)
                horizontalLineTo(5f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                moveTo(7f, 21f)
                horizontalLineTo(9f)
                verticalLineTo(19f)
                horizontalLineTo(7f)
                verticalLineTo(21f)
                close()
            }
        }.build()

        return _BorderRightVariant!!
    }

@Suppress("ObjectPropertyName")
private var _BorderRightVariant: ImageVector? = null
