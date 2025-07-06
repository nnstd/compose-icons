package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CompassRose: ImageVector
    get() {
        if (_CompassRose != null) {
            return _CompassRose!!
        }
        _CompassRose = ImageVector.Builder(
            name = "CompassRose",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 9f)
                lineTo(12f, 0f)
                lineTo(9f, 9f)
                lineTo(0f, 12f)
                lineTo(9f, 15f)
                lineTo(12f, 24f)
                lineTo(15f, 15f)
                lineTo(24f, 12f)
                lineTo(15f, 9f)
                moveTo(4f, 12f)
                lineTo(10f, 10f)
                lineTo(11f, 12f)
                horizontalLineTo(4f)
                moveTo(12f, 20f)
                lineTo(10f, 14f)
                lineTo(12f, 13f)
                verticalLineTo(20f)
                moveTo(12f, 4f)
                lineTo(14f, 10f)
                lineTo(12f, 11f)
                verticalLineTo(4f)
                moveTo(14f, 14f)
                lineTo(13f, 12f)
                horizontalLineTo(20f)
                lineTo(14f, 14f)
                moveTo(8.7f, 17.3f)
                lineTo(5f, 19f)
                lineTo(6.7f, 15.3f)
                lineTo(8.3f, 15.8f)
                lineTo(8.7f, 17.3f)
                moveTo(17.3f, 15.3f)
                lineTo(19f, 19f)
                lineTo(15.3f, 17.3f)
                lineTo(15.8f, 15.7f)
                lineTo(17.3f, 15.3f)
                moveTo(6.7f, 8.7f)
                lineTo(5f, 5f)
                lineTo(8.7f, 6.7f)
                lineTo(8.2f, 8.2f)
                lineTo(6.7f, 8.7f)
                moveTo(15.3f, 6.7f)
                lineTo(19f, 5f)
                lineTo(17.3f, 8.7f)
                lineTo(15.7f, 8.2f)
                lineTo(15.3f, 6.7f)
                close()
            }
        }.build()

        return _CompassRose!!
    }

@Suppress("ObjectPropertyName")
private var _CompassRose: ImageVector? = null
