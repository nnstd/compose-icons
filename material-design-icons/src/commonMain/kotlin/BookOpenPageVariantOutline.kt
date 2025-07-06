package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BookOpenPageVariantOutline: ImageVector
    get() {
        if (_BookOpenPageVariantOutline != null) {
            return _BookOpenPageVariantOutline!!
        }
        _BookOpenPageVariantOutline = ImageVector.Builder(
            name = "BookOpenPageVariantOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 1f)
                lineTo(14f, 6f)
                verticalLineTo(17f)
                lineTo(19f, 12.5f)
                verticalLineTo(1f)
                moveTo(21f, 5f)
                verticalLineTo(18.5f)
                curveTo(19.9f, 18.15f, 18.7f, 18f, 17.5f, 18f)
                curveTo(15.8f, 18f, 13.35f, 18.65f, 12f, 19.5f)
                verticalLineTo(6f)
                curveTo(10.55f, 4.9f, 8.45f, 4.5f, 6.5f, 4.5f)
                curveTo(4.55f, 4.5f, 2.45f, 4.9f, 1f, 6f)
                verticalLineTo(20.65f)
                curveTo(1f, 20.9f, 1.25f, 21.15f, 1.5f, 21.15f)
                curveTo(1.6f, 21.15f, 1.65f, 21.1f, 1.75f, 21.1f)
                curveTo(3.1f, 20.45f, 5.05f, 20f, 6.5f, 20f)
                curveTo(8.45f, 20f, 10.55f, 20.4f, 12f, 21.5f)
                curveTo(13.35f, 20.65f, 15.8f, 20f, 17.5f, 20f)
                curveTo(19.15f, 20f, 20.85f, 20.3f, 22.25f, 21.05f)
                curveTo(22.35f, 21.1f, 22.4f, 21.1f, 22.5f, 21.1f)
                curveTo(22.75f, 21.1f, 23f, 20.85f, 23f, 20.6f)
                verticalLineTo(6f)
                curveTo(22.4f, 5.55f, 21.75f, 5.25f, 21f, 5f)
                moveTo(10f, 18.41f)
                curveTo(8.75f, 18.09f, 7.5f, 18f, 6.5f, 18f)
                curveTo(5.44f, 18f, 4.18f, 18.19f, 3f, 18.5f)
                verticalLineTo(7.13f)
                curveTo(3.91f, 6.73f, 5.14f, 6.5f, 6.5f, 6.5f)
                curveTo(7.86f, 6.5f, 9.09f, 6.73f, 10f, 7.13f)
                verticalLineTo(18.41f)
                close()
            }
        }.build()

        return _BookOpenPageVariantOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BookOpenPageVariantOutline: ImageVector? = null
