package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HomeLightningBoltOutline: ImageVector
    get() {
        if (_HomeLightningBoltOutline != null) {
            return _HomeLightningBoltOutline!!
        }
        _HomeLightningBoltOutline = ImageVector.Builder(
            name = "HomeLightningBoltOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 20f)
                verticalLineTo(12f)
                horizontalLineTo(2f)
                lineTo(12f, 3f)
                lineTo(22f, 12f)
                horizontalLineTo(19f)
                verticalLineTo(20f)
                horizontalLineTo(5f)
                moveTo(12f, 5.69f)
                lineTo(7f, 10.19f)
                verticalLineTo(18f)
                horizontalLineTo(17f)
                verticalLineTo(10.19f)
                lineTo(12f, 5.69f)
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

        return _HomeLightningBoltOutline!!
    }

@Suppress("ObjectPropertyName")
private var _HomeLightningBoltOutline: ImageVector? = null
