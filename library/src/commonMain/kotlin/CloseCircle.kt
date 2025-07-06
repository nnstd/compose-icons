package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CloseCircle: ImageVector
    get() {
        if (_CloseCircle != null) {
            return _CloseCircle!!
        }
        _CloseCircle = ImageVector.Builder(
            name = "CloseCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(17.53f, 2f, 22f, 6.47f, 22f, 12f)
                curveTo(22f, 17.53f, 17.53f, 22f, 12f, 22f)
                curveTo(6.47f, 22f, 2f, 17.53f, 2f, 12f)
                curveTo(2f, 6.47f, 6.47f, 2f, 12f, 2f)
                moveTo(15.59f, 7f)
                lineTo(12f, 10.59f)
                lineTo(8.41f, 7f)
                lineTo(7f, 8.41f)
                lineTo(10.59f, 12f)
                lineTo(7f, 15.59f)
                lineTo(8.41f, 17f)
                lineTo(12f, 13.41f)
                lineTo(15.59f, 17f)
                lineTo(17f, 15.59f)
                lineTo(13.41f, 12f)
                lineTo(17f, 8.41f)
                lineTo(15.59f, 7f)
                close()
            }
        }.build()

        return _CloseCircle!!
    }

@Suppress("ObjectPropertyName")
private var _CloseCircle: ImageVector? = null
