package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ViewQuiltOutline: ImageVector
    get() {
        if (_ViewQuiltOutline != null) {
            return _ViewQuiltOutline!!
        }
        _ViewQuiltOutline = ImageVector.Builder(
            name = "ViewQuiltOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 5f)
                verticalLineTo(18f)
                horizontalLineTo(21f)
                verticalLineTo(5f)
                horizontalLineTo(4f)
                moveTo(6f, 16f)
                verticalLineTo(7f)
                horizontalLineTo(9f)
                verticalLineTo(16f)
                horizontalLineTo(6f)
                moveTo(11f, 16f)
                verticalLineTo(12.5f)
                horizontalLineTo(14f)
                verticalLineTo(16f)
                horizontalLineTo(11f)
                moveTo(19f, 16f)
                horizontalLineTo(16f)
                verticalLineTo(12.5f)
                horizontalLineTo(19f)
                verticalLineTo(16f)
                moveTo(11f, 10.5f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
                verticalLineTo(10.5f)
                horizontalLineTo(11f)
                close()
            }
        }.build()

        return _ViewQuiltOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ViewQuiltOutline: ImageVector? = null
