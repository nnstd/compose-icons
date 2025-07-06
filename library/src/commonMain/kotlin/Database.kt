package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Database: ImageVector
    get() {
        if (_Database != null) {
            return _Database!!
        }
        _Database = ImageVector.Builder(
            name = "Database",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3f)
                curveTo(7.58f, 3f, 4f, 4.79f, 4f, 7f)
                curveTo(4f, 9.21f, 7.58f, 11f, 12f, 11f)
                curveTo(16.42f, 11f, 20f, 9.21f, 20f, 7f)
                curveTo(20f, 4.79f, 16.42f, 3f, 12f, 3f)
                moveTo(4f, 9f)
                verticalLineTo(12f)
                curveTo(4f, 14.21f, 7.58f, 16f, 12f, 16f)
                curveTo(16.42f, 16f, 20f, 14.21f, 20f, 12f)
                verticalLineTo(9f)
                curveTo(20f, 11.21f, 16.42f, 13f, 12f, 13f)
                curveTo(7.58f, 13f, 4f, 11.21f, 4f, 9f)
                moveTo(4f, 14f)
                verticalLineTo(17f)
                curveTo(4f, 19.21f, 7.58f, 21f, 12f, 21f)
                curveTo(16.42f, 21f, 20f, 19.21f, 20f, 17f)
                verticalLineTo(14f)
                curveTo(20f, 16.21f, 16.42f, 18f, 12f, 18f)
                curveTo(7.58f, 18f, 4f, 16.21f, 4f, 14f)
                close()
            }
        }.build()

        return _Database!!
    }

@Suppress("ObjectPropertyName")
private var _Database: ImageVector? = null
