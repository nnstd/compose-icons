package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BookOpenBlankVariantOutline: ImageVector
    get() {
        if (_BookOpenBlankVariantOutline != null) {
            return _BookOpenBlankVariantOutline!!
        }
        _BookOpenBlankVariantOutline = ImageVector.Builder(
            name = "BookOpenBlankVariantOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 21.5f)
                curveTo(10.65f, 20.65f, 8.2f, 20f, 6.5f, 20f)
                curveTo(4.85f, 20f, 3.15f, 20.3f, 1.75f, 21.05f)
                curveTo(1.65f, 21.1f, 1.6f, 21.1f, 1.5f, 21.1f)
                curveTo(1.25f, 21.1f, 1f, 20.85f, 1f, 20.6f)
                verticalLineTo(6f)
                curveTo(1.6f, 5.55f, 2.25f, 5.25f, 3f, 5f)
                curveTo(4.11f, 4.65f, 5.33f, 4.5f, 6.5f, 4.5f)
                curveTo(8.45f, 4.5f, 10.55f, 4.9f, 12f, 6f)
                curveTo(13.45f, 4.9f, 15.55f, 4.5f, 17.5f, 4.5f)
                curveTo(18.67f, 4.5f, 19.89f, 4.65f, 21f, 5f)
                curveTo(21.75f, 5.25f, 22.4f, 5.55f, 23f, 6f)
                verticalLineTo(20.6f)
                curveTo(23f, 20.85f, 22.75f, 21.1f, 22.5f, 21.1f)
                curveTo(22.4f, 21.1f, 22.35f, 21.1f, 22.25f, 21.05f)
                curveTo(20.85f, 20.3f, 19.15f, 20f, 17.5f, 20f)
                curveTo(15.8f, 20f, 13.35f, 20.65f, 12f, 21.5f)
                moveTo(11f, 7.5f)
                curveTo(9.64f, 6.9f, 7.84f, 6.5f, 6.5f, 6.5f)
                curveTo(5.3f, 6.5f, 4.1f, 6.65f, 3f, 7f)
                verticalLineTo(18.5f)
                curveTo(4.1f, 18.15f, 5.3f, 18f, 6.5f, 18f)
                curveTo(7.84f, 18f, 9.64f, 18.4f, 11f, 19f)
                verticalLineTo(7.5f)
                moveTo(13f, 19f)
                curveTo(14.36f, 18.4f, 16.16f, 18f, 17.5f, 18f)
                curveTo(18.7f, 18f, 19.9f, 18.15f, 21f, 18.5f)
                verticalLineTo(7f)
                curveTo(19.9f, 6.65f, 18.7f, 6.5f, 17.5f, 6.5f)
                curveTo(16.16f, 6.5f, 14.36f, 6.9f, 13f, 7.5f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _BookOpenBlankVariantOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BookOpenBlankVariantOutline: ImageVector? = null
