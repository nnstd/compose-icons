package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TableTennis: ImageVector
    get() {
        if (_TableTennis != null) {
            return _TableTennis!!
        }
        _TableTennis = ImageVector.Builder(
            name = "TableTennis",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.5f, 14f)
                curveTo(19.9f, 14f, 21f, 15.1f, 21f, 16.5f)
                curveTo(21f, 17.9f, 19.9f, 19f, 18.5f, 19f)
                curveTo(17.1f, 19f, 16f, 17.9f, 16f, 16.5f)
                curveTo(16f, 15.1f, 17.1f, 14f, 18.5f, 14f)
                moveTo(7f, 15f)
                curveTo(7f, 15f, 8f, 16f, 8f, 17f)
                verticalLineTo(20.5f)
                curveTo(8f, 21.3f, 8.7f, 22f, 9.5f, 22f)
                curveTo(10.3f, 22f, 11f, 21.3f, 11f, 20.5f)
                verticalLineTo(17f)
                curveTo(11f, 16f, 12f, 15f, 12f, 15f)
                horizontalLineTo(7f)
                moveTo(8f, 14f)
                horizontalLineTo(11f)
                curveTo(11f, 14f, 16f, 14f, 16f, 9f)
                curveTo(16f, 4f, 12f, 2f, 9.5f, 2f)
                curveTo(7f, 2f, 3f, 4f, 3f, 9f)
                curveTo(3f, 14f, 8f, 14f, 8f, 14f)
                close()
            }
        }.build()

        return _TableTennis!!
    }

@Suppress("ObjectPropertyName")
private var _TableTennis: ImageVector? = null
