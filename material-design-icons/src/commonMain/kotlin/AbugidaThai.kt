package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AbugidaThai: ImageVector
    get() {
        if (_AbugidaThai != null) {
            return _AbugidaThai!!
        }
        _AbugidaThai = ImageVector.Builder(
            name = "AbugidaThai",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 20f)
                curveTo(9f, 17.44f, 10.87f, 12.42f, 13.86f, 7.25f)
                curveTo(14.29f, 6.5f, 15.08f, 6f, 16f, 6f)
                curveTo(17.12f, 6f, 18f, 6.88f, 18f, 8f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                verticalLineTo(8f)
                curveTo(20f, 5.8f, 18.2f, 4f, 16f, 4f)
                curveTo(14.34f, 4f, 12.9f, 4.92f, 12.13f, 6.25f)
                curveTo(10.56f, 8.96f, 9.61f, 11.15f, 9f, 13.03f)
                verticalLineTo(6.5f)
                curveTo(9f, 5.13f, 7.87f, 4f, 6.5f, 4f)
                curveTo(5.13f, 4f, 4f, 5.13f, 4f, 6.5f)
                curveTo(4f, 7.87f, 5.13f, 9f, 6.5f, 9f)
                curveTo(6.67f, 9f, 6.84f, 9f, 7f, 8.95f)
                verticalLineTo(20f)
                moveTo(6.5f, 6f)
                curveTo(6.79f, 6f, 7f, 6.21f, 7f, 6.5f)
                curveTo(7f, 6.79f, 6.79f, 7f, 6.5f, 7f)
                curveTo(6.21f, 7f, 6f, 6.79f, 6f, 6.5f)
                curveTo(6f, 6.21f, 6.21f, 6f, 6.5f, 6f)
                close()
            }
        }.build()

        return _AbugidaThai!!
    }

@Suppress("ObjectPropertyName")
private var _AbugidaThai: ImageVector? = null
