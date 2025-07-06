package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FilterMultipleOutline: ImageVector
    get() {
        if (_FilterMultipleOutline != null) {
            return _FilterMultipleOutline!!
        }
        _FilterMultipleOutline = ImageVector.Builder(
            name = "FilterMultipleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.47f, 5f)
                curveTo(3.25f, 5f, 3.04f, 5.08f, 2.87f, 5.21f)
                curveTo(2.43f, 5.55f, 2.35f, 6.18f, 2.69f, 6.61f)
                lineTo(2.69f, 6.62f)
                lineTo(7f, 12.14f)
                verticalLineTo(18.05f)
                lineTo(10.64f, 21.71f)
                curveTo(11f, 22.1f, 11.66f, 22.1f, 12.05f, 21.71f)
                lineTo(12.05f, 21.71f)
                curveTo(12.44f, 21.32f, 12.44f, 20.69f, 12.06f, 20.3f)
                lineTo(9f, 17.22f)
                verticalLineTo(11.45f)
                lineTo(4.27f, 5.39f)
                curveTo(4.08f, 5.14f, 3.78f, 5f, 3.47f, 5f)
                moveTo(21.62f, 3.22f)
                curveTo(21.43f, 3.08f, 21.22f, 3f, 21f, 3f)
                horizontalLineTo(7f)
                curveTo(6.78f, 3f, 6.57f, 3.08f, 6.38f, 3.22f)
                curveTo(5.95f, 3.56f, 5.87f, 4.19f, 6.21f, 4.62f)
                lineTo(11f, 10.75f)
                verticalLineTo(15.87f)
                curveTo(10.96f, 16.16f, 11.06f, 16.47f, 11.29f, 16.7f)
                lineTo(15.3f, 20.71f)
                curveTo(15.69f, 21.1f, 16.32f, 21.1f, 16.71f, 20.71f)
                curveTo(16.94f, 20.5f, 17.04f, 20.18f, 17f, 19.88f)
                verticalLineTo(10.75f)
                lineTo(21.79f, 4.62f)
                curveTo(22.13f, 4.19f, 22.05f, 3.56f, 21.62f, 3.22f)
                moveTo(15f, 10.05f)
                verticalLineTo(17.58f)
                lineTo(13f, 15.58f)
                verticalLineTo(10.06f)
                lineTo(9.04f, 5f)
                horizontalLineTo(18.96f)
                lineTo(15f, 10.05f)
                close()
            }
        }.build()

        return _FilterMultipleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FilterMultipleOutline: ImageVector? = null
