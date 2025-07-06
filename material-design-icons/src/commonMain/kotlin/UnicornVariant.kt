package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.UnicornVariant: ImageVector
    get() {
        if (_UnicornVariant != null) {
            return _UnicornVariant!!
        }
        _UnicornVariant = ImageVector.Builder(
            name = "UnicornVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 12f)
                verticalLineTo(19f)
                lineTo(17f, 20f)
                lineTo(14f, 15.33f)
                curveTo(13.71f, 14.89f, 13f, 15.14f, 13.08f, 15.67f)
                lineTo(14f, 23f)
                lineTo(4f, 18f)
                lineTo(4.96f, 12.75f)
                curveTo(5.56f, 9.42f, 8.46f, 7f, 11.84f, 7f)
                horizontalLineTo(13f)
                lineTo(19f, 1f)
                lineTo(17f, 7f)
                horizontalLineTo(20f)
                lineTo(18.42f, 9.37f)
                curveTo(19.36f, 9.88f, 20f, 10.86f, 20f, 12f)
                close()
            }
        }.build()

        return _UnicornVariant!!
    }

@Suppress("ObjectPropertyName")
private var _UnicornVariant: ImageVector? = null
