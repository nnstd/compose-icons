package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormSelect: ImageVector
    get() {
        if (_FormSelect != null) {
            return _FormSelect!!
        }
        _FormSelect = ImageVector.Builder(
            name = "FormSelect",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 5f)
                horizontalLineTo(18f)
                lineTo(16.5f, 7f)
                lineTo(15f, 5f)
                moveTo(5f, 2f)
                horizontalLineTo(19f)
                curveTo(20.11f, 2f, 21f, 2.9f, 21f, 4f)
                verticalLineTo(20f)
                curveTo(21f, 21.11f, 20.11f, 22f, 19f, 22f)
                horizontalLineTo(5f)
                curveTo(3.9f, 22f, 3f, 21.11f, 3f, 20f)
                verticalLineTo(4f)
                curveTo(3f, 2.9f, 3.9f, 2f, 5f, 2f)
                moveTo(5f, 4f)
                verticalLineTo(8f)
                horizontalLineTo(19f)
                verticalLineTo(4f)
                horizontalLineTo(5f)
                moveTo(5f, 20f)
                horizontalLineTo(19f)
                verticalLineTo(10f)
                horizontalLineTo(5f)
                verticalLineTo(20f)
                moveTo(7f, 12f)
                horizontalLineTo(17f)
                verticalLineTo(14f)
                horizontalLineTo(7f)
                verticalLineTo(12f)
                moveTo(7f, 16f)
                horizontalLineTo(17f)
                verticalLineTo(18f)
                horizontalLineTo(7f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _FormSelect!!
    }

@Suppress("ObjectPropertyName")
private var _FormSelect: ImageVector? = null
