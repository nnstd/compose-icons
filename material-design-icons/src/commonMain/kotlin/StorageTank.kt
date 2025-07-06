package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StorageTank: ImageVector
    get() {
        if (_StorageTank != null) {
            return _StorageTank!!
        }
        _StorageTank = ImageVector.Builder(
            name = "StorageTank",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 6f)
                horizontalLineTo(16f)
                verticalLineTo(5f)
                curveTo(16f, 3.9f, 15.1f, 3f, 14f, 3f)
                horizontalLineTo(10f)
                curveTo(8.9f, 3f, 8f, 3.9f, 8f, 5f)
                verticalLineTo(6f)
                horizontalLineTo(7f)
                curveTo(3.69f, 6f, 1f, 8.69f, 1f, 12f)
                reflectiveCurveTo(3.69f, 18f, 7f, 18f)
                verticalLineTo(21f)
                horizontalLineTo(9f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                verticalLineTo(21f)
                horizontalLineTo(17f)
                verticalLineTo(18f)
                curveTo(20.31f, 18f, 23f, 15.31f, 23f, 12f)
                reflectiveCurveTo(20.31f, 6f, 17f, 6f)
                moveTo(10f, 5f)
                horizontalLineTo(14f)
                verticalLineTo(6f)
                horizontalLineTo(10f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _StorageTank!!
    }

@Suppress("ObjectPropertyName")
private var _StorageTank: ImageVector? = null
