package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ToothOutline: ImageVector
    get() {
        if (_ToothOutline != null) {
            return _ToothOutline!!
        }
        _ToothOutline = ImageVector.Builder(
            name = "ToothOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 2f)
                curveTo(4f, 2f, 2f, 5f, 2f, 8f)
                curveTo(2f, 10.11f, 3f, 13f, 4f, 14f)
                curveTo(5f, 15f, 6f, 22f, 8f, 22f)
                curveTo(12.54f, 22f, 10f, 15f, 12f, 15f)
                curveTo(14f, 15f, 11.46f, 22f, 16f, 22f)
                curveTo(18f, 22f, 19f, 15f, 20f, 14f)
                curveTo(21f, 13f, 22f, 10.11f, 22f, 8f)
                curveTo(22f, 5f, 20f, 2f, 17f, 2f)
                curveTo(14f, 2f, 14f, 3f, 12f, 3f)
                curveTo(10f, 3f, 10f, 2f, 7f, 2f)
                moveTo(7f, 4f)
                curveTo(9f, 4f, 10f, 5f, 12f, 5f)
                curveTo(14f, 5f, 15f, 4f, 17f, 4f)
                curveTo(18.67f, 4f, 20f, 6f, 20f, 8f)
                curveTo(20f, 9.75f, 19.14f, 12.11f, 18.19f, 13.06f)
                curveTo(17.33f, 13.92f, 16.06f, 19.94f, 15.5f, 19.94f)
                curveTo(15.29f, 19.94f, 15f, 18.88f, 15f, 17.59f)
                curveTo(15f, 15.55f, 14.43f, 13f, 12f, 13f)
                curveTo(9.57f, 13f, 9f, 15.55f, 9f, 17.59f)
                curveTo(9f, 18.88f, 8.71f, 19.94f, 8.5f, 19.94f)
                curveTo(7.94f, 19.94f, 6.67f, 13.92f, 5.81f, 13.06f)
                curveTo(4.86f, 12.11f, 4f, 9.75f, 4f, 8f)
                curveTo(4f, 6f, 5.33f, 4f, 7f, 4f)
                close()
            }
        }.build()

        return _ToothOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ToothOutline: ImageVector? = null
