package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Cryengine: ImageVector
    get() {
        if (_Cryengine != null) {
            return _Cryengine!!
        }
        _Cryengine = ImageVector.Builder(
            name = "Cryengine",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.03f, 12.4f)
                moveTo(23.03f, 12.5f)
                verticalLineTo(12.5f)
                curveTo(23f, 13f, 20.91f, 15.23f, 17.82f, 16.24f)
                curveTo(14.05f, 17.5f, 7.97f, 17.03f, 7.97f, 12.3f)
                curveTo(7.97f, 10.08f, 9.78f, 8.27f, 12f, 8.27f)
                curveTo(14.25f, 8.27f, 16.05f, 10.09f, 16.05f, 12.31f)
                curveTo(16.05f, 13.39f, 15.58f, 14.44f, 14.87f, 15.18f)
                curveTo(15.54f, 15.17f, 17.94f, 15f, 20.21f, 13.12f)
                curveTo(20.46f, 12.88f, 20.62f, 12.68f, 20.69f, 12.55f)
                curveTo(20.71f, 12.5f, 20.74f, 12.46f, 20.73f, 12.4f)
                curveTo(20.73f, 11.92f, 18.12f, 8.19f, 12.72f, 7.12f)
                curveTo(19.22f, 7.46f, 23f, 11.32f, 23.03f, 12.4f)
                verticalLineTo(12.5f)
                horizontalLineTo(23.03f)
                moveTo(12f, 10f)
                curveTo(10.74f, 10f, 9.71f, 11.04f, 9.71f, 12.3f)
                curveTo(9.71f, 13.57f, 10.74f, 14.59f, 12f, 14.59f)
                curveTo(13.27f, 14.59f, 14.29f, 13.57f, 14.29f, 12.3f)
                curveTo(14.29f, 11.04f, 13.27f, 10f, 12f, 10f)
                moveTo(3.31f, 12.34f)
                curveTo(3.31f, 12.34f, 3.31f, 12.31f, 3.31f, 12.42f)
                verticalLineTo(12.42f)
                curveTo(3.41f, 12.94f, 4.82f, 15.41f, 10.28f, 16.88f)
                curveTo(3.96f, 16.37f, 1.12f, 13.28f, 1.04f, 12.42f)
                horizontalLineTo(1.03f)
                curveTo(1.03f, 12.31f, 1.03f, 12.36f, 1.03f, 12.35f)
                curveTo(1.03f, 11.5f, 4.96f, 7.58f, 10.92f, 7.15f)
                curveTo(6.14f, 8.26f, 3.31f, 11.87f, 3.31f, 12.34f)
                verticalLineTo(12.34f)
                close()
            }
        }.build()

        return _Cryengine!!
    }

@Suppress("ObjectPropertyName")
private var _Cryengine: ImageVector? = null
