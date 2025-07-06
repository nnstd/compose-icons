package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormDropdown: ImageVector
    get() {
        if (_FormDropdown != null) {
            return _FormDropdown!!
        }
        _FormDropdown = ImageVector.Builder(
            name = "FormDropdown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 5f)
                horizontalLineTo(20f)
                lineTo(18.5f, 7f)
                lineTo(17f, 5f)
                moveTo(3f, 2f)
                horizontalLineTo(21f)
                curveTo(22.11f, 2f, 23f, 2.9f, 23f, 4f)
                verticalLineTo(8f)
                curveTo(23f, 9.11f, 22.11f, 10f, 21f, 10f)
                horizontalLineTo(16f)
                verticalLineTo(20f)
                curveTo(16f, 21.11f, 15.11f, 22f, 14f, 22f)
                horizontalLineTo(3f)
                curveTo(1.9f, 22f, 1f, 21.11f, 1f, 20f)
                verticalLineTo(4f)
                curveTo(1f, 2.9f, 1.9f, 2f, 3f, 2f)
                moveTo(3f, 4f)
                verticalLineTo(8f)
                horizontalLineTo(14f)
                verticalLineTo(4f)
                horizontalLineTo(3f)
                moveTo(21f, 8f)
                verticalLineTo(4f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                horizontalLineTo(21f)
                moveTo(3f, 20f)
                horizontalLineTo(14f)
                verticalLineTo(10f)
                horizontalLineTo(3f)
                verticalLineTo(20f)
                moveTo(5f, 12f)
                horizontalLineTo(12f)
                verticalLineTo(14f)
                horizontalLineTo(5f)
                verticalLineTo(12f)
                moveTo(5f, 16f)
                horizontalLineTo(12f)
                verticalLineTo(18f)
                horizontalLineTo(5f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _FormDropdown!!
    }

@Suppress("ObjectPropertyName")
private var _FormDropdown: ImageVector? = null
