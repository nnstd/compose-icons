package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Curtains: ImageVector
    get() {
        if (_Curtains != null) {
            return _Curtains!!
        }
        _Curtains = ImageVector.Builder(
            name = "Curtains",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 3f)
                horizontalLineTo(1f)
                verticalLineTo(1f)
                horizontalLineTo(23f)
                verticalLineTo(3f)
                moveTo(2f, 22f)
                horizontalLineTo(6f)
                curveTo(6f, 19f, 4f, 17f, 4f, 17f)
                curveTo(10f, 13f, 11f, 4f, 11f, 4f)
                horizontalLineTo(2f)
                verticalLineTo(22f)
                moveTo(22f, 4f)
                horizontalLineTo(13f)
                curveTo(13f, 4f, 14f, 13f, 20f, 17f)
                curveTo(20f, 17f, 18f, 19f, 18f, 22f)
                horizontalLineTo(22f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _Curtains!!
    }

@Suppress("ObjectPropertyName")
private var _Curtains: ImageVector? = null
