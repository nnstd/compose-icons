package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CardSearchOutline: ImageVector
    get() {
        if (_CardSearchOutline != null) {
            return _CardSearchOutline!!
        }
        _CardSearchOutline = ImageVector.Builder(
            name = "CardSearchOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.5f, 16f)
                curveTo(12.37f, 16f, 13.19f, 15.74f, 13.88f, 15.3f)
                lineTo(16.32f, 17.74f)
                lineTo(17.74f, 16.32f)
                lineTo(15.3f, 13.89f)
                curveTo(15.74f, 13.19f, 16f, 12.38f, 16f, 11.5f)
                curveTo(16f, 9f, 14f, 7f, 11.5f, 7f)
                reflectiveCurveTo(7f, 9f, 7f, 11.5f)
                reflectiveCurveTo(9f, 16f, 11.5f, 16f)
                moveTo(11.5f, 9f)
                curveTo(12.88f, 9f, 14f, 10.12f, 14f, 11.5f)
                reflectiveCurveTo(12.88f, 14f, 11.5f, 14f)
                reflectiveCurveTo(9f, 12.88f, 9f, 11.5f)
                reflectiveCurveTo(10.12f, 9f, 11.5f, 9f)
                moveTo(20f, 4f)
                horizontalLineTo(4f)
                curveTo(2.9f, 4f, 2f, 4.9f, 2f, 6f)
                verticalLineTo(18f)
                curveTo(2f, 19.1f, 2.9f, 20f, 4f, 20f)
                horizontalLineTo(20f)
                curveTo(21.1f, 20f, 22f, 19.1f, 22f, 18f)
                verticalLineTo(6f)
                curveTo(22f, 4.9f, 21.1f, 4f, 20f, 4f)
                moveTo(20f, 18f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                horizontalLineTo(20f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _CardSearchOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CardSearchOutline: ImageVector? = null
