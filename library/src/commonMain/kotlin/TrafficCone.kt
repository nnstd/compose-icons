package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TrafficCone: ImageVector
    get() {
        if (_TrafficCone != null) {
            return _TrafficCone!!
        }
        _TrafficCone = ImageVector.Builder(
            name = "TrafficCone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 15f)
                lineTo(18f, 19f)
                horizontalLineTo(21f)
                verticalLineTo(22f)
                horizontalLineTo(3f)
                verticalLineTo(19f)
                horizontalLineTo(6f)
                lineTo(7f, 15f)
                horizontalLineTo(17f)
                moveTo(15f, 8f)
                lineTo(16f, 12f)
                horizontalLineTo(8f)
                lineTo(9f, 8f)
                horizontalLineTo(15f)
                moveTo(13f, 1f)
                lineTo(14f, 5f)
                horizontalLineTo(10f)
                lineTo(11f, 1f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _TrafficCone!!
    }

@Suppress("ObjectPropertyName")
private var _TrafficCone: ImageVector? = null
