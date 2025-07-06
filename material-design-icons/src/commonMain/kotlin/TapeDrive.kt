package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TapeDrive: ImageVector
    get() {
        if (_TapeDrive != null) {
            return _TapeDrive!!
        }
        _TapeDrive = ImageVector.Builder(
            name = "TapeDrive",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 10f)
                curveTo(13.11f, 10f, 14f, 10.9f, 14f, 12f)
                curveTo(14f, 13.11f, 13.11f, 14f, 12f, 14f)
                curveTo(10.9f, 14f, 10f, 13.11f, 10f, 12f)
                curveTo(10f, 10.9f, 10.9f, 10f, 12f, 10f)
                moveTo(5f, 3f)
                horizontalLineTo(19f)
                curveTo(20.11f, 3f, 21f, 3.9f, 21f, 5f)
                verticalLineTo(17f)
                horizontalLineTo(16.9f)
                curveTo(18.2f, 15.73f, 19f, 13.96f, 19f, 12f)
                curveTo(19f, 8.13f, 15.87f, 5f, 12f, 5f)
                curveTo(8.13f, 5f, 5f, 8.13f, 5f, 12f)
                curveTo(5f, 15.87f, 8.13f, 19f, 12f, 19f)
                horizontalLineTo(21f)
                curveTo(21f, 20.11f, 20.11f, 21f, 19f, 21f)
                horizontalLineTo(5f)
                curveTo(3.9f, 21f, 3f, 20.11f, 3f, 19f)
                verticalLineTo(5f)
                curveTo(3f, 3.9f, 3.9f, 3f, 5f, 3f)
                close()
            }
        }.build()

        return _TapeDrive!!
    }

@Suppress("ObjectPropertyName")
private var _TapeDrive: ImageVector? = null
