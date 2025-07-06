package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.KeyboardVariant: ImageVector
    get() {
        if (_KeyboardVariant != null) {
            return _KeyboardVariant!!
        }
        _KeyboardVariant = ImageVector.Builder(
            name = "KeyboardVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 16f)
                horizontalLineTo(18f)
                verticalLineTo(18f)
                horizontalLineTo(6f)
                verticalLineTo(16f)
                moveTo(6f, 13f)
                verticalLineTo(15f)
                horizontalLineTo(2f)
                verticalLineTo(13f)
                horizontalLineTo(6f)
                moveTo(7f, 15f)
                verticalLineTo(13f)
                horizontalLineTo(10f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                moveTo(11f, 15f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                moveTo(14f, 15f)
                verticalLineTo(13f)
                horizontalLineTo(17f)
                verticalLineTo(15f)
                horizontalLineTo(14f)
                moveTo(18f, 15f)
                verticalLineTo(13f)
                horizontalLineTo(22f)
                verticalLineTo(15f)
                horizontalLineTo(18f)
                moveTo(2f, 10f)
                horizontalLineTo(5f)
                verticalLineTo(12f)
                horizontalLineTo(2f)
                verticalLineTo(10f)
                moveTo(19f, 12f)
                verticalLineTo(10f)
                horizontalLineTo(22f)
                verticalLineTo(12f)
                horizontalLineTo(19f)
                moveTo(18f, 12f)
                horizontalLineTo(16f)
                verticalLineTo(10f)
                horizontalLineTo(18f)
                verticalLineTo(12f)
                moveTo(8f, 12f)
                horizontalLineTo(6f)
                verticalLineTo(10f)
                horizontalLineTo(8f)
                verticalLineTo(12f)
                moveTo(12f, 12f)
                horizontalLineTo(9f)
                verticalLineTo(10f)
                horizontalLineTo(12f)
                verticalLineTo(12f)
                moveTo(15f, 12f)
                horizontalLineTo(13f)
                verticalLineTo(10f)
                horizontalLineTo(15f)
                verticalLineTo(12f)
                moveTo(2f, 9f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                verticalLineTo(9f)
                horizontalLineTo(2f)
                moveTo(5f, 9f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                horizontalLineTo(5f)
                moveTo(8f, 9f)
                verticalLineTo(7f)
                horizontalLineTo(10f)
                verticalLineTo(9f)
                horizontalLineTo(8f)
                moveTo(11f, 9f)
                verticalLineTo(7f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                moveTo(14f, 9f)
                verticalLineTo(7f)
                horizontalLineTo(16f)
                verticalLineTo(9f)
                horizontalLineTo(14f)
                moveTo(17f, 9f)
                verticalLineTo(7f)
                horizontalLineTo(22f)
                verticalLineTo(9f)
                horizontalLineTo(17f)
                close()
            }
        }.build()

        return _KeyboardVariant!!
    }

@Suppress("ObjectPropertyName")
private var _KeyboardVariant: ImageVector? = null
