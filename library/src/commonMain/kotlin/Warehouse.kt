package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Warehouse: ImageVector
    get() {
        if (_Warehouse != null) {
            return _Warehouse!!
        }
        _Warehouse = ImageVector.Builder(
            name = "Warehouse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 19f)
                horizontalLineTo(8f)
                verticalLineTo(21f)
                horizontalLineTo(6f)
                verticalLineTo(19f)
                moveTo(12f, 3f)
                lineTo(2f, 8f)
                verticalLineTo(21f)
                horizontalLineTo(4f)
                verticalLineTo(13f)
                horizontalLineTo(20f)
                verticalLineTo(21f)
                horizontalLineTo(22f)
                verticalLineTo(8f)
                lineTo(12f, 3f)
                moveTo(8f, 11f)
                horizontalLineTo(4f)
                verticalLineTo(9f)
                horizontalLineTo(8f)
                verticalLineTo(11f)
                moveTo(14f, 11f)
                horizontalLineTo(10f)
                verticalLineTo(9f)
                horizontalLineTo(14f)
                verticalLineTo(11f)
                moveTo(20f, 11f)
                horizontalLineTo(16f)
                verticalLineTo(9f)
                horizontalLineTo(20f)
                verticalLineTo(11f)
                moveTo(6f, 15f)
                horizontalLineTo(8f)
                verticalLineTo(17f)
                horizontalLineTo(6f)
                verticalLineTo(15f)
                moveTo(10f, 15f)
                horizontalLineTo(12f)
                verticalLineTo(17f)
                horizontalLineTo(10f)
                verticalLineTo(15f)
                moveTo(10f, 19f)
                horizontalLineTo(12f)
                verticalLineTo(21f)
                horizontalLineTo(10f)
                verticalLineTo(19f)
                moveTo(14f, 19f)
                horizontalLineTo(16f)
                verticalLineTo(21f)
                horizontalLineTo(14f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _Warehouse!!
    }

@Suppress("ObjectPropertyName")
private var _Warehouse: ImageVector? = null
