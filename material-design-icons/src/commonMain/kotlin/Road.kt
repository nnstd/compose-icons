package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Road: ImageVector
    get() {
        if (_Road != null) {
            return _Road!!
        }
        _Road = ImageVector.Builder(
            name = "Road",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 16f)
                horizontalLineTo(13f)
                verticalLineTo(20f)
                horizontalLineTo(11f)
                moveTo(11f, 10f)
                horizontalLineTo(13f)
                verticalLineTo(14f)
                horizontalLineTo(11f)
                moveTo(11f, 4f)
                horizontalLineTo(13f)
                verticalLineTo(8f)
                horizontalLineTo(11f)
                moveTo(4f, 22f)
                horizontalLineTo(20f)
                verticalLineTo(2f)
                horizontalLineTo(4f)
                verticalLineTo(22f)
                close()
            }
        }.build()

        return _Road!!
    }

@Suppress("ObjectPropertyName")
private var _Road: ImageVector? = null
