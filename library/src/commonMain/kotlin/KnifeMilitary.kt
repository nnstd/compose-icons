package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.KnifeMilitary: ImageVector
    get() {
        if (_KnifeMilitary != null) {
            return _KnifeMilitary!!
        }
        _KnifeMilitary = ImageVector.Builder(
            name = "KnifeMilitary",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 2f)
                lineTo(17.39f, 3.75f)
                lineTo(10.46f, 10.68f)
                lineTo(14f, 14.22f)
                lineTo(20.92f, 7.29f)
                curveTo(22.43f, 5.78f, 22f, 2f, 22f, 2f)
                moveTo(8.33f, 10f)
                lineTo(6.92f, 11.39f)
                lineTo(8.33f, 12.8f)
                lineTo(2.68f, 18.46f)
                lineTo(6.21f, 22f)
                lineTo(11.87f, 16.34f)
                lineTo(13.28f, 17.76f)
                lineTo(14.7f, 16.34f)
                lineTo(8.33f, 10f)
                close()
            }
        }.build()

        return _KnifeMilitary!!
    }

@Suppress("ObjectPropertyName")
private var _KnifeMilitary: ImageVector? = null
