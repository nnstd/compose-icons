package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ParachuteOutline: ImageVector
    get() {
        if (_ParachuteOutline != null) {
            return _ParachuteOutline!!
        }
        _ParachuteOutline = ImageVector.Builder(
            name = "ParachuteOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.2f, 10.95f)
                lineTo(12f, 23f)
                lineTo(2.78f, 10.96f)
                lineTo(2.87f, 10.88f)
                curveTo(3.08f, 10.67f, 3.33f, 10.5f, 3.58f, 10.36f)
                lineTo(10.73f, 19.69f)
                lineTo(8.58f, 13f)
                lineTo(9.24f, 11.81f)
                lineTo(12f, 20.38f)
                lineTo(14.73f, 11.8f)
                lineTo(15.4f, 13f)
                lineTo(13.27f, 19.69f)
                lineTo(20.41f, 10.35f)
                curveTo(20.66f, 10.5f, 20.9f, 10.64f, 21.1f, 10.85f)
                lineTo(21.2f, 10.95f)
                moveTo(12f, 4f)
                curveTo(14.5f, 4f, 16.77f, 5.17f, 18.25f, 7.03f)
                curveTo(17.24f, 7.15f, 16.28f, 7.54f, 15.47f, 8.13f)
                curveTo(14.47f, 7.41f, 13.26f, 7f, 12f, 7f)
                curveTo(10.71f, 7f, 9.5f, 7.41f, 8.5f, 8.14f)
                curveTo(7.68f, 7.55f, 6.72f, 7.17f, 5.71f, 7.04f)
                curveTo(7.19f, 5.17f, 9.47f, 4f, 12f, 4f)
                moveTo(12f, 2f)
                curveTo(7.09f, 2f, 3.03f, 5.5f, 2.16f, 10.17f)
                curveTo(2.89f, 9.45f, 3.89f, 9f, 5f, 9f)
                curveTo(6.5f, 9f, 7.81f, 9.86f, 8.5f, 11.1f)
                curveTo(9.17f, 9.86f, 10.47f, 9f, 12f, 9f)
                curveTo(13.5f, 9f, 14.8f, 9.85f, 15.5f, 11.09f)
                curveTo(16.16f, 9.84f, 17.47f, 9f, 19f, 9f)
                curveTo(20.09f, 9f, 21.09f, 9.42f, 21.81f, 10.14f)
                curveTo(20.94f, 5.5f, 16.88f, 2f, 12f, 2f)
                close()
            }
        }.build()

        return _ParachuteOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ParachuteOutline: ImageVector? = null
