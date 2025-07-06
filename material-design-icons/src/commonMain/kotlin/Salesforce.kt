package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Salesforce: ImageVector
    get() {
        if (_Salesforce != null) {
            return _Salesforce!!
        }
        _Salesforce = ImageVector.Builder(
            name = "Salesforce",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.38f, 6.37f)
                curveTo(17.68f, 6.37f, 17.07f, 6.58f, 16.47f, 6.78f)
                curveTo(15.77f, 5.57f, 14.46f, 4.77f, 13.05f, 4.77f)
                curveTo(11.95f, 4.77f, 10.95f, 5.27f, 10.24f, 5.97f)
                curveTo(9.44f, 4.97f, 8.23f, 4.26f, 6.83f, 4.26f)
                curveTo(4.5f, 4.26f, 2.5f, 6.17f, 2.5f, 8.5f)
                curveTo(2.5f, 9.09f, 2.71f, 9.69f, 2.91f, 10.29f)
                curveTo(1.8f, 10.9f, 1f, 12.1f, 1f, 13.5f)
                curveTo(1f, 15.5f, 2.61f, 17.22f, 4.62f, 17.22f)
                curveTo(4.92f, 17.22f, 5.22f, 17.22f, 5.42f, 17.12f)
                curveTo(5.82f, 18.63f, 7.33f, 19.74f, 9.14f, 19.74f)
                curveTo(10.84f, 19.74f, 12.25f, 18.73f, 12.75f, 17.32f)
                curveTo(13.26f, 17.53f, 13.76f, 17.73f, 14.26f, 17.73f)
                curveTo(15.57f, 17.73f, 16.77f, 17f, 17.37f, 15.92f)
                curveTo(17.68f, 16f, 18f, 16f, 18.28f, 16f)
                curveTo(20.89f, 16f, 23f, 13.91f, 23f, 11.2f)
                curveTo(23.1f, 8.5f, 21f, 6.37f, 18.38f, 6.37f)
                close()
            }
        }.build()

        return _Salesforce!!
    }

@Suppress("ObjectPropertyName")
private var _Salesforce: ImageVector? = null
