package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountHardHatOutline: ImageVector
    get() {
        if (_AccountHardHatOutline != null) {
            return _AccountHardHatOutline!!
        }
        _AccountHardHatOutline = ImageVector.Builder(
            name = "AccountHardHatOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 9f)
                curveTo(16f, 14.33f, 8f, 14.33f, 8f, 9f)
                horizontalLineTo(10f)
                curveTo(10f, 11.67f, 14f, 11.67f, 14f, 9f)
                moveTo(20f, 18f)
                verticalLineTo(21f)
                horizontalLineTo(4f)
                verticalLineTo(18f)
                curveTo(4f, 15.33f, 9.33f, 14f, 12f, 14f)
                curveTo(14.67f, 14f, 20f, 15.33f, 20f, 18f)
                moveTo(18.1f, 18f)
                curveTo(18.1f, 17.36f, 14.97f, 15.9f, 12f, 15.9f)
                curveTo(9.03f, 15.9f, 5.9f, 17.36f, 5.9f, 18f)
                verticalLineTo(19.1f)
                horizontalLineTo(18.1f)
                moveTo(12.5f, 2f)
                curveTo(12.78f, 2f, 13f, 2.22f, 13f, 2.5f)
                verticalLineTo(5.5f)
                horizontalLineTo(14f)
                verticalLineTo(3f)
                curveTo(15.45f, 3.67f, 16.34f, 5.16f, 16.25f, 6.75f)
                curveTo(16.25f, 6.75f, 16.95f, 6.89f, 17f, 8f)
                horizontalLineTo(7f)
                curveTo(7f, 6.89f, 7.75f, 6.75f, 7.75f, 6.75f)
                curveTo(7.66f, 5.16f, 8.55f, 3.67f, 10f, 3f)
                verticalLineTo(5.5f)
                horizontalLineTo(11f)
                verticalLineTo(2.5f)
                curveTo(11f, 2.22f, 11.22f, 2f, 11.5f, 2f)
            }
        }.build()

        return _AccountHardHatOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AccountHardHatOutline: ImageVector? = null
