package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HomeLightningBolt: ImageVector
    get() {
        if (_HomeLightningBolt != null) {
            return _HomeLightningBolt!!
        }
        _HomeLightningBolt = ImageVector.Builder(
            name = "HomeLightningBolt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3f)
                lineTo(2f, 12f)
                horizontalLineTo(5f)
                verticalLineTo(20f)
                horizontalLineTo(19f)
                verticalLineTo(12f)
                horizontalLineTo(22f)
                lineTo(12f, 3f)
                moveTo(11.5f, 18f)
                verticalLineTo(14f)
                horizontalLineTo(9f)
                lineTo(12.5f, 7f)
                verticalLineTo(11f)
                horizontalLineTo(15f)
                lineTo(11.5f, 18f)
                close()
            }
        }.build()

        return _HomeLightningBolt!!
    }

@Suppress("ObjectPropertyName")
private var _HomeLightningBolt: ImageVector? = null
