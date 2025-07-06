package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TableFurniture: ImageVector
    get() {
        if (_TableFurniture != null) {
            return _TableFurniture!!
        }
        _TableFurniture = ImageVector.Builder(
            name = "TableFurniture",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 7f)
                horizontalLineTo(22f)
                verticalLineTo(10f)
                horizontalLineTo(20f)
                lineTo(21f, 19f)
                horizontalLineTo(18.5f)
                lineTo(17.94f, 14f)
                horizontalLineTo(6.06f)
                lineTo(5.5f, 19f)
                horizontalLineTo(3f)
                lineTo(4f, 10f)
                horizontalLineTo(2f)
                verticalLineTo(7f)
                moveTo(17.5f, 10f)
                horizontalLineTo(6.5f)
                lineTo(6.29f, 12f)
                horizontalLineTo(17.71f)
                lineTo(17.5f, 10f)
                close()
            }
        }.build()

        return _TableFurniture!!
    }

@Suppress("ObjectPropertyName")
private var _TableFurniture: ImageVector? = null
