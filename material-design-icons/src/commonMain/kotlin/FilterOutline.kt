package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FilterOutline: ImageVector
    get() {
        if (_FilterOutline != null) {
            return _FilterOutline!!
        }
        _FilterOutline = ImageVector.Builder(
            name = "FilterOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 19.88f)
                curveTo(15.04f, 20.18f, 14.94f, 20.5f, 14.71f, 20.71f)
                curveTo(14.32f, 21.1f, 13.69f, 21.1f, 13.3f, 20.71f)
                lineTo(9.29f, 16.7f)
                curveTo(9.06f, 16.47f, 8.96f, 16.16f, 9f, 15.87f)
                verticalLineTo(10.75f)
                lineTo(4.21f, 4.62f)
                curveTo(3.87f, 4.19f, 3.95f, 3.56f, 4.38f, 3.22f)
                curveTo(4.57f, 3.08f, 4.78f, 3f, 5f, 3f)
                verticalLineTo(3f)
                horizontalLineTo(19f)
                verticalLineTo(3f)
                curveTo(19.22f, 3f, 19.43f, 3.08f, 19.62f, 3.22f)
                curveTo(20.05f, 3.56f, 20.13f, 4.19f, 19.79f, 4.62f)
                lineTo(15f, 10.75f)
                verticalLineTo(19.88f)
                moveTo(7.04f, 5f)
                lineTo(11f, 10.06f)
                verticalLineTo(15.58f)
                lineTo(13f, 17.58f)
                verticalLineTo(10.05f)
                lineTo(16.96f, 5f)
                horizontalLineTo(7.04f)
                close()
            }
        }.build()

        return _FilterOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FilterOutline: ImageVector? = null
