package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RoadVariant: ImageVector
    get() {
        if (_RoadVariant != null) {
            return _RoadVariant!!
        }
        _RoadVariant = ImageVector.Builder(
            name = "RoadVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.1f, 4.8f)
                curveTo(18f, 4.3f, 17.6f, 4f, 17.1f, 4f)
                horizontalLineTo(13f)
                lineTo(13.2f, 7f)
                horizontalLineTo(10.8f)
                lineTo(11f, 4f)
                horizontalLineTo(6.8f)
                curveTo(6.3f, 4f, 5.9f, 4.4f, 5.8f, 4.8f)
                lineTo(3.1f, 18.8f)
                curveTo(3f, 19.4f, 3.5f, 20f, 4.1f, 20f)
                horizontalLineTo(10f)
                lineTo(10.3f, 15f)
                horizontalLineTo(13.7f)
                lineTo(14f, 20f)
                horizontalLineTo(19.8f)
                curveTo(20.4f, 20f, 20.9f, 19.4f, 20.8f, 18.8f)
                lineTo(18.1f, 4.8f)
                moveTo(10.4f, 13f)
                lineTo(10.6f, 9f)
                horizontalLineTo(13.2f)
                lineTo(13.4f, 13f)
                horizontalLineTo(10.4f)
                close()
            }
        }.build()

        return _RoadVariant!!
    }

@Suppress("ObjectPropertyName")
private var _RoadVariant: ImageVector? = null
