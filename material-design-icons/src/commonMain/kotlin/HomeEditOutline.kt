package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HomeEditOutline: ImageVector
    get() {
        if (_HomeEditOutline != null) {
            return _HomeEditOutline!!
        }
        _HomeEditOutline = ImageVector.Builder(
            name = "HomeEditOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.041f, 11.14f)
                curveTo(21.183f, 11.14f, 21.317f, 11.197f, 21.421f, 11.303f)
                lineTo(22.697f, 12.579f)
                curveTo(22.912f, 12.792f, 22.912f, 13.14f, 22.697f, 13.349f)
                lineTo(21.697f, 14.349f)
                lineTo(19.651f, 12.303f)
                lineTo(20.651f, 11.303f)
                curveTo(20.76f, 11.197f, 20.901f, 11.14f, 21.041f, 11.14f)
                close()
                moveTo(19.063f, 12.88f)
                lineTo(21.109f, 14.932f)
                lineTo(15.063f, 21f)
                lineTo(13f, 21f)
                lineTo(13f, 18.937f)
                lineTo(19.063f, 12.88f)
                close()
                moveTo(12f, 5.688f)
                lineTo(7f, 10.188f)
                lineTo(7f, 18f)
                lineTo(11f, 18f)
                lineTo(11f, 20f)
                lineTo(5f, 20f)
                lineTo(5f, 12f)
                lineTo(2f, 12f)
                lineTo(12f, 3f)
                lineTo(19.459f, 9.713f)
                lineTo(17f, 12.172f)
                lineTo(17f, 10.188f)
                lineTo(12f, 5.688f)
                close()
            }
        }.build()

        return _HomeEditOutline!!
    }

@Suppress("ObjectPropertyName")
private var _HomeEditOutline: ImageVector? = null
