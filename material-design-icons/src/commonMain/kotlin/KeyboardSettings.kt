package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.KeyboardSettings: ImageVector
    get() {
        if (_KeyboardSettings != null) {
            return _KeyboardSettings!!
        }
        _KeyboardSettings = ImageVector.Builder(
            name = "KeyboardSettings",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 10f)
                horizontalLineTo(17f)
                verticalLineTo(8f)
                horizontalLineTo(19f)
                moveTo(19f, 13f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                horizontalLineTo(19f)
                moveTo(16f, 10f)
                horizontalLineTo(14f)
                verticalLineTo(8f)
                horizontalLineTo(16f)
                moveTo(16f, 13f)
                horizontalLineTo(14f)
                verticalLineTo(11f)
                horizontalLineTo(16f)
                moveTo(16f, 17f)
                horizontalLineTo(8f)
                verticalLineTo(15f)
                horizontalLineTo(16f)
                moveTo(7f, 10f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                horizontalLineTo(7f)
                moveTo(7f, 13f)
                horizontalLineTo(5f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                moveTo(8f, 11f)
                horizontalLineTo(10f)
                verticalLineTo(13f)
                horizontalLineTo(8f)
                moveTo(8f, 8f)
                horizontalLineTo(10f)
                verticalLineTo(10f)
                horizontalLineTo(8f)
                moveTo(11f, 11f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                moveTo(11f, 8f)
                horizontalLineTo(13f)
                verticalLineTo(10f)
                horizontalLineTo(11f)
                moveTo(20f, 5f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 7f)
                verticalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 19f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 17f)
                verticalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 5f)
                moveTo(7f, 22f)
                horizontalLineTo(9f)
                verticalLineTo(24f)
                horizontalLineTo(7f)
                verticalLineTo(22f)
                moveTo(11f, 22f)
                horizontalLineTo(13f)
                verticalLineTo(24f)
                horizontalLineTo(11f)
                verticalLineTo(22f)
                moveTo(15f, 22f)
                horizontalLineTo(17f)
                verticalLineTo(24f)
                horizontalLineTo(15f)
                verticalLineTo(22f)
                close()
            }
        }.build()

        return _KeyboardSettings!!
    }

@Suppress("ObjectPropertyName")
private var _KeyboardSettings: ImageVector? = null
