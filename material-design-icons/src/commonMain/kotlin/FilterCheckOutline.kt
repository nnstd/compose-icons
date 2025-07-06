package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FilterCheckOutline: ImageVector
    get() {
        if (_FilterCheckOutline != null) {
            return _FilterCheckOutline!!
        }
        _FilterCheckOutline = ImageVector.Builder(
            name = "FilterCheckOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 19.88f)
                curveTo(13.04f, 20.18f, 12.94f, 20.5f, 12.72f, 20.71f)
                curveTo(12.32f, 21.1f, 11.69f, 21.1f, 11.3f, 20.71f)
                lineTo(7.29f, 16.7f)
                curveTo(7.06f, 16.47f, 6.96f, 16.16f, 7f, 15.87f)
                verticalLineTo(10.75f)
                lineTo(2.21f, 4.62f)
                curveTo(1.87f, 4.19f, 1.95f, 3.56f, 2.38f, 3.22f)
                curveTo(2.57f, 3.08f, 2.78f, 3f, 3f, 3f)
                horizontalLineTo(17f)
                curveTo(17.22f, 3f, 17.43f, 3.08f, 17.62f, 3.22f)
                curveTo(18.05f, 3.56f, 18.13f, 4.19f, 17.79f, 4.62f)
                lineTo(13f, 10.75f)
                verticalLineTo(19.88f)
                moveTo(5.04f, 5f)
                lineTo(9f, 10.07f)
                verticalLineTo(15.58f)
                lineTo(11f, 17.58f)
                verticalLineTo(10.05f)
                lineTo(14.96f, 5f)
                horizontalLineTo(5.04f)
                moveTo(17.75f, 21f)
                lineTo(15f, 18f)
                lineTo(16.16f, 16.84f)
                lineTo(17.75f, 18.43f)
                lineTo(21.34f, 14.84f)
                lineTo(22.5f, 16.25f)
                lineTo(17.75f, 21f)
            }
        }.build()

        return _FilterCheckOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FilterCheckOutline: ImageVector? = null
